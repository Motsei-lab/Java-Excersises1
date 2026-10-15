import org.example.*;


void main() {
    Scanner input = new Scanner(System.in);

    StudentsDetails student = new StudentsDetails();

    student.name = "Naledi";
    student.age = 20;
    student.avgMark = 76.5;
    student.registrationStatus = true;

    student.displayDetails();

    ShoppingTotal item = new ShoppingTotal();
    item.productName = "Ps5";
    item.unitPrice = 12000.00;
    item.quantity = 3;

    item.calculateCost();
    item.dicountedAmt();
    item.displayAmt();

    TemperatureConverter temp = new TemperatureConverter();
    temp.celsius = 10.0;
    temp.fahrenheit = 50.0;
    temp.celToFahConvert();
    temp.fahToCelConvert();
    temp.displayConversions();



    System.out.println("Please enter your mark");
    int num = input.nextInt();
    PasssOrFail stu = new PasssOrFail();
    stu.mark = num;
    stu.determinePassorFail();


    System.out.println("Please enter the mark you have got for your exam ");
    int num1 = input.nextInt();
    GradeCalculator grade = new GradeCalculator();
    grade.mark = num1;
    grade.classifyMarks();

    System.out.println("Enter an integer number");
    int num2 = input.nextInt();
    NumberAnalysis na = new NumberAnalysis();
    na.number = num2;
    na.determineInt();

    System.out.println("Please enter your username");
    String us = input.nextLine();
    System.out.println("Please enter your password");
    String pass = input.nextLine();

    LoginCheck me = new LoginCheck();
    me.username = us;
    me.password = pass;
    me.checkLogin();

    StudentMarks mm = new StudentMarks();
    mm.calculateArrays();

    ArrayStatistics as = new ArrayStatistics();
    as.largeSmallValue();

    ArraySearch s = new ArraySearch();
    s.search();

    EvenOddArray eoa = new EvenOddArray();
    eoa.arrays();

    ReverseArray ra = new ReverseArray();
    ra.reverse();
    System.out.println("============================================================");
    Student stu1 = new Student("Motsei","223765899",89.0);
    stu1.displayDetails();
    stu1.hasPassed();
    System.out.println("============================================================");
    Student stu2 = new Student("Donald","262226678",49.0);
    stu2.displayDetails();
    stu2.hasPassed();
    System.out.println("============================================================");


    BankAccount tel1 = new BankAccount("Mr Sefanyetso","12345678900",0);
    tel1.getBalance();
    tel1.deposit(10);
    tel1.getBalance();
    tel1.withdraw(6);
    tel1.getBalance();

    Product prod = new Product("1","Ps5",10,5);
    prod.displayDetails();
    prod.addStock(5);
    prod.displayDetails();
    prod.reduceStock(12);
    prod.displayDetails();
    System.out.println("Stock Value:" + prod.stockValue());
    Product prod2 = new Product("2","Xboxone",15,3);
    prod2.displayDetails();
    prod2.addStock(5);
    prod2.displayDetails();
    prod2.reduceStock(1);
    prod2.displayDetails();
    System.out.println("Stock Value:" + prod2.stockValue());

    Rectangle r1 = new Rectangle(15,10);
    System.out.println("Area: " + r1.area());
    System.out.println("Perimeter: " +r1.perimeter());
    Rectangle r2 = new Rectangle(4,7);
    System.out.println("Area: " + r2.area());
    System.out.println("Perimeter: " +r2.perimeter());
    int count=0;
    Students stud1 = new Students("224567889","Tshepo",new int[]{95,100,66});
    stud1.calAvg();
    stud1.studPassed();
    if(stud1.hasPassed){
        count++;
    }
    stud1.summary();
    Students stud2 = new Students("2245882335","Motsei",new int[]{90,100,98});
    stud2.calAvg();
    stud2.studPassed();
    if(stud2.hasPassed){
        count++;
    }
    stud2.summary();
    Students stud3 = new Students("2244441015","Lebo",new int[]{40,40,45});
    stud3.calAvg();
    stud3.studPassed();
    if(stud3.hasPassed){
        count++;
    }
    stud3.summary();
    System.out.println("The number of students that have passed are: " +count);

    ArrayList<Double> students = new ArrayList<>();
    students.add(stud1.average);
    students.add(stud2.average);
    students.add(stud3.average);

    double max = students.get(0);

    for(int i =0; i< students.size(); i++){

        if( max <= students.get(i)){

            max = students.get(i);


        }

    }


    System.out.println("Max" +  max);




products[] prodArray = new products[4];
prodArray[0] = new products("Cookies",5.0,5);
prodArray[1] = new products("Lollipop",2.0,5 );
prodArray[2] = new products("Milk",1000.0,5);
prodArray[3] = new products("Doughnut",7.0,5);




DecimalFormat df = new DecimalFormat("##.##");


double max1 = 0;

String all = "";

for (products product : prodArray)
{

    max1 += product.calculateStock();
    all += "\n" + product.toString() + " Line Total " + product.calculateStock();
}
double discount=0.0;
double finTotal = 0.0;
if(max1 > 1000){
    discount = max1 * 0.1;
}

finTotal = max1 - discount;


    System.out.println("All Lines \n" + all + " \n\n SubTotal : " + max1 + " \nDiscount " + discount + "\n Final " + df.format( finTotal) );






}



