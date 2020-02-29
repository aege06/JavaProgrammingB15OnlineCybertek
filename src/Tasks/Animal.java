package Tasks;

public abstract class Animal {
    public abstract void eat();

    public abstract void sleep();

    }


    class Cat extends Animal {
        @Override
        public void eat() {
            System.out.println("Cat eats fish");
        }

        @Override
        public void sleep() {
            System.out.println("Cat sleeps 14 hours");
        }
    }

    class KingKong extends Animal {
        @Override
        public void eat() {
            System.out.println("KingKong eats human");
        }

        @Override
        public void sleep() {
            System.out.println("KingKong sleeps 14 hours");
        }
    }

    class Test1 {
        public static void main(String[] args) {
            KingKong obj = new KingKong();
            obj.eat();
            Cat obj2 = new Cat();
            obj2.eat();
        }
    }
