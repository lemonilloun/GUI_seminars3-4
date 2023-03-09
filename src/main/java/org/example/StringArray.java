package org.example;

    import java.util.Arrays;

    public class StringArray {
        private String[] array;
        private int size;

        public StringArray() {
            array = new String[10];
            size = 0;
        }

        public void add(String element) {
            if (size == array.length) {
                return;
            }
            int i;
            for (i = 0; i < size; i++) {
                if (element.length() < array[i].length()) {
                    for (int j = size; j > i; j--) {
                        array[j] = array[j - 1];
                    }
                    array[i] = element;
                    size++;
                    return;
                }
            }
            array[size++] = element;
        }

        public String getMax() {
            if (size == 0) {
                return null;
            }
            return array[size - 1];
        }

        public double getAverageLength() {
            if (size == 0) {
                return 0;
            }
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += array[i].length();
            }
            return (double) sum / size;
        }

    }

