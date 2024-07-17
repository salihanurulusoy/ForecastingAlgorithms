public class Method2 {

    static Node2 forecast =new Node2();
    public static Node2 forecast(){
        double B = 0.2;
        double[] St = new double[24];
        double[] Gt = new double[24];


        St[0]=200;
        Gt[0]=50;
        for (int i = 0; i<24; i++){
            if(i==0){
                St[0]=200;
                Gt[0]=50;
            }else {
                double a=0.2;
                St[i]=  a* Main.list.getByPosition(i-1).getNum()+(1-a)*(St[i-1] + Gt[i-1]);

                Gt[i]=  B*(St[i]-St[i-1])+(1-B)*Gt[i-1];
            }



            forecast.insert((int) (St[i]+Gt[i]));
        }
        return forecast;
    }
    public static double mistake(){

        return Mse.Mse(forecast,Main.list);
    }
}

