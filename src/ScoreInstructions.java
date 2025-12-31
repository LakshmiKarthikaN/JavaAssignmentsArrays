public class ScoreInstructions {
    public static void main(String[] args) {
            System.out.println("Try programiz.pro");
            String[] instructions={"add","jump", "add"};
            int[] value = {5,-2,10};
            boolean[] visited=new boolean[value.length];
            long score=0;
            int i=0;
            while(i>=0 && i<value.length){
                if(visited[i]){
                    break;
                }visited[i]=true;
                    if(instructions[i].equals("jump")) {
                        i = i + value[i];
                    }

                    else if(instructions[i].equals("add")){
                        score=score+value[i];
                        i=i+1;
                    }
                }

            System.out.println(score);
        }

}
