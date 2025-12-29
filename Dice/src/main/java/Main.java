void main() {
    String line = "-".repeat(50);
    String intro = "Dice Roller";

    IO.println(line);
    IO.println(intro);
    IO.println(line);

    Scanner input = new Scanner(System.in);
    IO.println("How many dice would you like to roll?");
    int dice = input.nextInt();
    if (dice <= 1) {
        IO.println("You want to roll " + dice + " die.");
    } else {
        IO.println("You want to roll " + dice + " dice.");
    }

    roll(dice);

    input.close();

}

public static void roll(int dices) {

    int sum = 0;

    for (int i = 0; i < dices; i++) {
        int num = (int) (Math.random() * 6) + 1;
        IO.println("Dice " + (i + 1) + " is " + num);
        sum += num;
    }

    IO.println("You rolled " + sum);
}
