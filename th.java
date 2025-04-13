class th extends Thread {
    void mythread() {
        start();
    }

    public void run() {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        th t = new th();
        t.start();
    }
}
