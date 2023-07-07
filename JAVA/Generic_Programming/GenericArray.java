class GenericArray<T> {
    T a[];

    GenericArray(T x) {
        a = x;
    }

    T getData(int i) {
        return a[i];
    }

    public void printdata(T b[]) {
        for (int i = 0; i < b.length; i++)
            System.out.println(b.getData(i) + " ");
        System.out.println();
    }
}