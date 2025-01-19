public class Nested_Ternary {
    public static void main(String[] args) {

        int marks= 70;
        String result= (marks>=90 && marks<100)? "Grade A" :
                (marks>=80 && marks<89) ? "Grade B" :
                        (marks>=70 && marks<79) ? "Grade C" :
                                (marks>=60 && marks<69) ? "Grade D" :
                                        (marks>=0 && marks<59) ? "Grade F" : "Failed";
        System.out.println(result);
    }
}

