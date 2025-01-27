public class Javaloop_practice {
        public static void main(String[] args) {
            int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 122};

            for (int i = 0; i < arr2.length; i++) {  // Corrected loop syntax
                if (arr2[i] % 2 == 0) {  // Checking for even numbers
                    System.out.println(arr2[i]);
                }
                else {
                    System.out.println(arr2[i]  + "Not divisible by 2");
                }
            }
        }
    }
