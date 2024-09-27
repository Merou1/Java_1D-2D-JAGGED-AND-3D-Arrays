//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("bob");
        dog.eat();
        System.out.println(dog.getName());
        dog.setName("perus");
        System.out.println(dog.getName());

        int[] nums = new int [3];
        nums[0]=3;
        int[] nums2 = {1,2,3};
        for (int i : nums){
            System.out.print(i+",");//i takes values so no need of nums[i]
        }

        int [][] nums3= new int [3][3];
        //fill the array manually

//        nums3[0][0]=1;
//        nums3[0][1]=13;
//        nums3[0][2]=4;
//        nums3[1][0]=56;
//        nums3[1][1]=432;
//        nums3[1][2]=2;
//        nums3[2][0]=798;
//        nums3[2][1]=0;
//        nums3[2][2]=9;
//        System.out.println();


        //fill the array using a loop
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                //random generates rand nums between 0 and 1
                //nums3[i][j]=(int) Math.random()*100;//this will always give 0 because it does int of math.random wich willbe 0(kayakhed partie entière minorée) then *100
                //that why we need parenthese:
                nums3[i][j]=(int) (Math.random()*100);
            }
        }
        System.out.println();

        for (int i=0;i<nums3.length;i++){ //nums.length returns the number of rows
            for (int j=0;j<3;j++) {
                System.out.print(nums3[i][j]+" ");
            }
            System.out.println();
        }
        for (int[] i : nums3){// int [] i hit kula elt(ligne) f tableau nums houa tableau
            for (int j : i){ //(j houa kul elt men tableau i li huma ar9am bash 3amer)
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //jagged array: array that has different columns in each row(array)
        int [][] numbers = new int [3][];
        numbers[0]=new int [3];
        numbers[1]=new int [4];
        numbers[2]=new int [2];


        for(int i=0;i<numbers.length;i++){//numbers.length returns the number of rown
            for(int j=0;j<numbers[i].length;j++){//numbers[i] is each row wich contain an array so j will be the eìindex of each element of that in array in that row
                numbers[i][j]=(int)(Math.random()*100);
            }
        }
        System.out.println("Jagged array");
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        //3d array
        int [][][] nums4 = new int [2][3][4];

        for (int i=0;i<nums4.length;i++){//nums4.length returns the number of rows of nums4
            for(int j=0;j<nums4[i].length;j++){
                for(int n=0;n<nums4[i][j].length;n++){//n loops in the colums of nums4[j] arrays they are the last arrays
                    nums4[i][j][n]=(int)(Math.random()*10);
                    System.out.print(nums4[i][j][n]+" ");
                }

            }
            System.out.println();

        }





    }
}