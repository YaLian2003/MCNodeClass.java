public class MCNode {
    private char letter;
    private MCNode left;
    private MCNode right;

    public MCNode(char letter) {
        this.letter = letter;
        left = null;
        right = null;
    }

    public void setLeft(MCNode left) {
        this.left = left;
    }

    public void setRight(MCNode right) {
        this.right = right;
    }

    public char getLetter() {
        return letter;
    }

    public MCNode getLeft() {
        return left;
    }

    public MCNode getRight() {
        return right;
    }
}
