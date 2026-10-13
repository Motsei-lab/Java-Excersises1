import org.example.ShoppingTotal;
import org.example.StudentsDetails;
import org.example.TemperatureConverter;


void main() {

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




    }

