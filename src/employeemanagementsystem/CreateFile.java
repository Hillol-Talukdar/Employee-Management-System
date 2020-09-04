package employeemanagementsystem;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Hillol Talukdar
 * ID    : 181-115-029
 * Batch : CSE(44th) 
 * 
 */

public class CreateFile 
{
    private File file = new File("employee.txt");;
    
    public CreateFile()
    {
        try
        {
            file.createNewFile();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e, "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
    public  File getFile()
    {
        return file;
    }
    
    public  String getPath()
    {
        return file.getAbsolutePath();
    }
    
    public  void deleteFile()
    {
        file.delete();
    }
    
    public  String getName()
    {
        return file.getName();
    }
}
