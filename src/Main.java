public class Main {
    public static void main(String[] args) {

        String[] array = {"привет", "меня", "меня", "привет", "зовут", "Илья", "тебя", "зовут", "Илья", "!"};
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null)
                for (int i1 = 0; i1 < array.length; i1++) {
                    if (i != i1 && array[i1] != null && array[i].equals(array[i1])) {
                        array[i1] = null;
                    }

                }
        }
        String stroka = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                stroka = stroka + array[i];
            }
        }
        System.out.println(stroka);

    }

}
