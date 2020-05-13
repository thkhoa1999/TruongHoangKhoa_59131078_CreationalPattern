
package BT2;


public class main2
{
   public static void main(String[] args) 
   {
        MyStringBuilder myString = new MyStringBuilder.Builder()
            .addString("\n Tên: Trương Hoàng Khoa")
            .addString("\n MSSV: 59131078")
            .addString("\n Bài tập 2")
            .addString("\n số thập phân: ")
            .addFloat((float)0.1 )
            .addBool(true)
            .BD();
        
        System.out.println(myString.toString());
   }
    
            
    
}
