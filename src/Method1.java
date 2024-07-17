public class Method1 {
    private static  double a= 0.2;
    static Node2 forecast =new Node2();
    public static Node2 first(){
        forecast.insert(300,0);
        for (int i = 0; i<23; i++){

            forecast.insert((int) (a*Main.list.getByPosition(i).getNum()+(1-a)* forecast.getByPosition(i).getNum()));

        }

        return forecast;
    }
    public static double mistake(){

        return Mse.Mse(forecast,Main.list);
    }


}

