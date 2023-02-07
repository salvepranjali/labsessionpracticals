class Demo1 implements Runnable {

int k = 0;

public Demo1(int i) {

this.k = i;

}

public static void main(String[] args)

{

new Demo1(2).run();

new Demo1(1).run();

}

public void run() {

for(int i=0; i<k; i++) {

System.out.println("run() method...");

}

}

}

