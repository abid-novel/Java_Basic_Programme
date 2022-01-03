package Assignment2;

//Task_6: Extract only transaction ID from the HTML
//<html> <body> <div> <p>Transaction Successful</p> <p>Trnx ID: TXN5164870</p> </div> </body> </html>

public class Task_6 {
    public static void main(String[] args) {
        String str = "<html> <body> <div> <p>Transaction Successful</p> <p>Trnx ID: TXN5164870</p> </div> </body> </html>";
        System.out.println(str.substring(str.indexOf("TXN"),72));
    }
}
