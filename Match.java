public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight , int maxWeight){

        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }

    void run(){

        if(isCheck()){
            while(this.f1.healthy >0 && this.f2.healthy >0){

                System.out.println("======== YENİ ROUND ===========");

                // Math.round() en yakın tam sayıya yuvarlar.
                int chance = Math.round((float) Math.random());
                System.out.println("chance : " + chance);

                //f1 başlıyor.
                if(chance==0) {

                    System.out.println(this.f1.name + " başlıyor!");
                    this.f2.healthy = this.f1.hit(this.f2);

                    if (this.f2.healthy == 0) {

                        System.out.println(this.f1.name + " maçı kazandı.");
                        break;
                    }
                }
                if(chance==1) {

                    System.out.println(this.f2.name + " başlıyor!");
                    this.f1.healthy = this.f2.hit(this.f1);

                    if (this.f1.healthy == 0) {

                        System.out.println(this.f2.name + " maçı kazandı.");
                        break;
                    }
                }
                printScore();
            }
        }
        else{

            System.out.println("Sporcuların sikletleri uymuyor.");
        }

    }

    boolean isCheck(){

        if((this.f1.weight>=this.minWeight && this.f1.weight<=this.maxWeight) && (this.f2.weight>=this.minWeight && this.f2.weight<=this.maxWeight)){

            return true;
        }

        else {

            return false;
        }

    }

    void printScore() {

        System.out.println("------------");
        System.out.println(f1.name + "'ın" + " Kalan Can'ı \t:" + f1.healthy);
        System.out.println(f2.name + "'ın" +" Kalan Can'ı \t:" + f2.healthy);
    }




}
