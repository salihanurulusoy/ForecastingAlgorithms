public class Mse {
    public static double Mse(Node2 a, Node b){
        double MSE=0;
        //MSE = (∑_(i=1)^n▒〖〖(D〗_(t-) F_t)〗^2 )/n
        double toplam=0;
        double[] SquarredError = new double[24];

        for (int i = 0; i<24; i++){

            SquarredError[i]=(b.getByPosition(i).getNum()-a.getByPosition(i).getNum())*(b.getByPosition(i).getNum()-a.getByPosition(i).getNum());
            toplam= (toplam+SquarredError[i]);
        }

        MSE=toplam/24;


        return MSE;

    }
}

