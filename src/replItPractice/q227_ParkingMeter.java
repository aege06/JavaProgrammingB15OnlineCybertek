package replItPractice;

public class q227_ParkingMeter {
        int timeLeft=0;
        int maxTime;
        public q227_ParkingMeter(int maxTime){
            this.maxTime=maxTime;
        }
        public boolean add (int time){
            if(time==25 && timeLeft<maxTime ){
                timeLeft+=30;
                return true;
            }else{
                timeLeft=0;
                return false;
            }
        }
        public void tick(){
            if(timeLeft>0){
                timeLeft=timeLeft-1;
            }
        }
        public boolean isExpired(){
            if(timeLeft==0) {
                return true;
            }else{
            return false;
        }
    }
}
