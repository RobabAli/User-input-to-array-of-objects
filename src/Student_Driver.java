import java.util.Scanner;

public class Student_Driver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int N = input.nextInt();
        input.nextLine();

        Student obj[] = new Student[N];

        //Instantiating the array
        //This prevents Null Exception Error from happening
        for(int i=0; i<N; i++){
            obj[i] = new Student();
        }

        for(int i=0; i<N; i++){
            System.out.print("Enter name: ");
            obj[i].setName(input.nextLine());

            System.out.print("Enter id: ");
            obj[i].setId(input.nextInt());

            System.out.print("Enter CGPA: ");
            obj[i].setCgpa(input.nextDouble());

            System.out.print("Enter Credits Passed: ");
            obj[i].setCreditPassed(input.nextDouble());
            input.nextLine();

        }

        double MAX_CG = obj[0].getCgpa();
        for(int i=0; i<N; i++){
             if(obj[i].getCgpa()>MAX_CG){
                 MAX_CG = obj[i].getCgpa();
             }
        }

        double MIN_CG = obj[0].getCgpa();
        for(int i=0; i<N; i++){
            if(obj[i].getCgpa()<MIN_CG){
                MIN_CG = obj[i].getCgpa();
            }
        }

        double sum = 0;
        for(int i=0; i<N;i++){
            sum += obj[i].getCgpa();
        }
        System.out.print("Highest CGPA: " + MAX_CG + "\n");
        System.out.print("Lowest CGPA: " + MIN_CG + "\n");
        System.out.printf("Average CGPA: %.2f", sum/(double)N);

        System.out.print("\n\n");
        for(int i=0; i<N; i++){
            System.out.println(obj[i].toString());
        }

    }
}
