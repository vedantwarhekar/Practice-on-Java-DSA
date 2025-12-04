package FileHandling;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

class Employee implements Serializable{
    private static final long serialVersionUID = 1L;
    String name;
    double salary;
    transient String secretCode;

    public Employee(String name, double salary,String secretCode)
    {
        this.name = name;
        this.salary = salary;
        this.secretCode = secretCode;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + ", secretCode='" + secretCode + "'}";
    }
}
public class FileAndSerializationDemoUsingNIO {
    public static void main(String[] args)
    {
        Path textPath = Paths.get("nioEmployeeData.txt");
        Path objectPath = Paths.get("employeeObject.ser");

        try{
            // write in the file
            String data = "Java NIO makes file handling easier!\n"
                    + "We can write and read files in one line.\n";
            Files.write(textPath,data.getBytes());
            System.out.println("✅ Data written to " + textPath);

            //read in the file
            List<String> lines = Files.readAllLines(textPath);
            System.out.println("📖 File content:");
            lines.forEach(System.out :: println);

            // Check file exists
            if (Files.exists(textPath)) {
                System.out.println("✅ File exists at: " + textPath.toAbsolutePath());
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        Employee emp = new Employee("Vedant", 55000.75, "TopSecret123");

        // Serialize (save object)
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(objectPath))){
             oos.writeObject(emp);
             System.out.println("✅ Object serialized using NIO to " + objectPath);
        }catch(IOException e)
        {
            e.printStackTrace();
        }

        //  Deserialize (read object)
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(objectPath)))
        {
            Employee emp2 = (Employee) ois.readObject();
            System.out.println("📦 Deserialized object: " + emp2);
        }catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
