package FileHandling;

import java.io.*;

class Student implements Serializable{

    private static final long serialVersionUID = 1L;
    String name;
    int age;
    transient String password;

    public Student(String name,int age,String password)
    {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString()
    {
        return "Student{name='" + name + "', age=" + age + ", password='" + password + "'}";
    }
}

public class FileAndSerializationDemo {
    public static void main(String[] args)
    {
       String textFile = "studentData.txt";
       String objectFile = "studentObject.ser";

       try{
           // to write in a file
           FileWriter writer = new FileWriter(textFile);
           writer.write("Hello Java file handling!\n");
           writer.write("let's learn reading and writing files. \n");
           writer.close();
           System.out.println("✅ Text written to " + textFile);

           //to read in file
           BufferedReader reader = new BufferedReader(new FileReader(textFile));
           System.out.println("📖 Reading from file:");
           String line;
           while ((line = reader.readLine()) != null)
           {
               System.out.println(line);
           }
           reader.close();
       }catch(IOException e){
            e.printStackTrace();
       }

       // Serialization
       Student s1 = new Student("vedant",22,"mypassword");
       try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(objectFile))){
            oos.writeObject(s1);
           System.out.println("✅ Object serialized to " + objectFile);
       }catch (IOException e)
       {
           e.printStackTrace();
       }

       //Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(objectFile))){
            Student s2 = (Student) ois.readObject();
            System.out.println("📦 Deserialized object: " + s2);
        }catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
