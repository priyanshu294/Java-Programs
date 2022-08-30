import java.io.*;
public class Bg
{
public static void main(String arg[]) throws IOException


{
DataInputStream dis=new DataInputStream(System.in);

System.out.print("\n Specify the path of *.jpg or *.bmp file \n e.g= c:/users/example.bmp or c:\\users\\example.bmp \n\n :->");

String str=dis.readLine();

File f = new File(str);

 if (!f.exists() || f.isDirectory())
 {

            System.out.println("File does not exist: " + f);

            return;

        }


Runtime.getRuntime().exec("cmd /c start reg add \"HKCU\\Control Panel\\Desktop\" /v Wallpaper /d \" "+str+" \" /f ");


Runtime.getRuntime().exec("cmd /c start %windir%\\System32\\rundll32.exe user32.dll,UpdatePerUserSystemParameters");

Runtime.getRuntime().exec("shutdown -l");
}

}