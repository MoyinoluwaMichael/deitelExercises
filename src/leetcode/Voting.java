package leetcode;

public class Voting {
    private
    int a, b;

    public void calculateVote(int [][] votes){
        a = 4;
        b = 3;
        String [] candidates = {"Mrs Adams", "Mr Bean", "Mr Crab", "Mrs Dean", "Mrs East", "Mr Fish"};
        int [] voteCounts = new int[candidates.length];
        for (int i = 0; i < votes.length; i++){
            for (int j = 0; j < votes[i].length; j++){
                switch (votes[i][j]){
                    case 1: voteCounts[i] += 6; break;
                    case 2: voteCounts[i] += 5; break;
                    case 3: voteCounts[i] += 4; break;
                    case 4: voteCounts[i] += 3; break;
                    case 5: voteCounts[i] += 2; break;
                    case 6: voteCounts[i] += 1; break;
                }
            }
        }
        for (int i = 0; i < candidates.length; i++){
            System.out.println(candidates[i] + ": " + voteCounts[i]);
        }
    }

    public static void main(String[] args) {
        Voting voting = new Voting();
        int [][] votes = {{1,2,3,4,5,6},{2,3,4,5,6,1},{3,4,5,6,1,2},{4,5,6,1,2,3},{5,6,1,2,3,4},{6,1,2,3,4,5}};
//        voting.calculateVote(votes);

        int i=2;
        int a=++i;
        int b=i;
        i=4;
        int c=i++;
        int d=i;
        i++;

        int j;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("i="+i);
        System.out.println("d="+d);
    }
}
