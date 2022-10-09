public class main {

    public static void main(String[] args) {

        double mass = 50;
        double height = 1.7;

        if(mass <=0 || height<=0){
            System.out.println("Неверные данные");
        }
        else {
            BmiService index = new BmiService();

            System.out.println("Индекс массы тела: " + index.calculate(mass, height));
        }
    }
}
