class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pas =new ArrayList();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> row = new ArrayList();
            for(int j=0;j<=i;j++)
            {
                if(j==0 ||j==i){
                    row.add(1);
                }
                else{
                    List<Integer> previous_row = pas.get(i-1);
                    row.add(previous_row.get(j)+previous_row.get(j-1));
                }
            }
            pas.add(row);
        }
        return pas;
    }
}
