public class Method3 {
    static Node2 forecast =new Node2();
    public static Node2 third(){


        int[] xy = new int[24];
        int[] xx = new int[24];

        int xytoplam=0;
        for (int i = 0; i<24; i++){
            xy[i]=Main.list.getByPosition(i).getNum()*(i+1);
            xytoplam=xytoplam+xy[i];

        }

        int xxtoplam=0;
        for (int i = 0; i<24; i++){
            xx[i]=(i+1)*(i+1);
            xxtoplam=xxtoplam+xx[i];

        }
        double ytoplam=0;
        for (int i = 0; i<24; i++){
            ytoplam=Main.list.getByPosition(i).getNum()+ytoplam;

        }
        int xtoplam =0;
        for (int i = 0; i<24; i++){
            xtoplam=xtoplam+i+1;

        }

        double q= (Main.list.size()*xytoplam-xtoplam*ytoplam);
        double w=(Main.list.size()*xxtoplam-xtoplam*xtoplam);
        double b= q/w;
        double z=ytoplam/24;
        double aa= (z)-((b*xtoplam)/Main.list.size());


        for (int i = 0; i<24; i++){
            forecast.insert((int) (aa+b*(i+1))) ;
        }

        return forecast;
    }
    public static double mistake(){

        return Mse.Mse(forecast,Main.list);
    }
}

