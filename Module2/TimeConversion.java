import java.util.Scanner;

/*
*TIME CONVERSION:
*A program to convert and print the entered time in 24-hour format(military time)
*Entered time is in 12-hour clock format , (ie.: hh:mmAM or hh:mmPM).
*/

public class TimeConversion {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        
        timeConversion();
            
    }

    public static void timeConversion()
    {
        do{
            
            System.out.println("Please input time to convert:");
            String time = scanner.next();
            if(time.equals("q")){
                break;
            }
            var splitTimeArray = time.split(":");      
            var hour = splitTimeArray[0];
            var minute = (splitTimeArray[1].substring(0, 2));
            var ampm = splitTimeArray[1].substring(2, 4);
    
            if(hour.equals("12") && ampm.equalsIgnoreCase("am")){
                hour = "00";
            }
            else if(!hour.equals("12") && ampm.equalsIgnoreCase("pm")){
                int h = Integer.parseInt(hour);
                h = h + 12 ;
                hour = String.valueOf(h);
            }
            
            String convertedTime = hour.concat(":").concat(minute);

            System.out.println("Converted Time:"+convertedTime);

            System.out.println(); 
        
        }while(true);
       
        System.out.println("Exiting....");
        scanner.close();
    }

    
}