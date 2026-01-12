class Counter {
    static int count = 0; // shared
    int num = 0;
    Counter() {
        count++;
        num++;
    }
}