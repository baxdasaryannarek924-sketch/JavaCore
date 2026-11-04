
    package homeworks.dynamicarray;

    public class DynamicArray {

        // Հիմնական զանգված
        private int[] array = new int[10];

        // Ավելացված էլեմենտների քանակ
        private int size = 0;

        // Ավելացնել նոր էլեմենտ
        public void add(int value) {

            // Ստուգում ենք՝ արդյոք զանգվածը լցված է
            if (size == array.length) {
                extend();
            }

            // Ավելացնում ենք նոր էլեմենտը
            array[size] = value;

            // Մեծացնում ենք էլեմենտների քանակը
            size++;
        }

        // Մեծացնել զանգվածի տարողությունը
        private void extend() {

            // Ստեղծում ենք 10-ով ավելի մեծ զանգված
            int[] newArray = new int[array.length + 10];

            // Պատճենում ենք հին զանգվածի էլեմենտները
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }

            // Հին զանգվածը փոխարինում ենք նորով
            array = newArray;
        }

        // Ստանալ էլեմենտն ըստ ինդեքսի
        public int getByIndex(int index) {

            if (index >= 0 && index < size) {
                return array[index];
            }

            return -1;
        }

        // Տպել բոլոր ավելացված էլեմենտները
        public void print() {

            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }

            System.out.println();
        }
    }

