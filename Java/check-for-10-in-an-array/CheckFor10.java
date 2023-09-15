public class CheckFor10 {
public static void main(String[] args) {
int[] nums = {5, 10, 15, 20, 25};
boolean hasTen = false;
for (int num : nums) {

if (num == 10) {
hasTen = true;
break;
}
}
if (hasTen) {
System.out.println("The array contains a 10.");
} else {
System.out.println("The array does not contain a 10.");
}
}
}