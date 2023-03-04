class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor) return image;
        helper(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    public void helper(int[][]image, int sr, int sc, int Color, int newColor){
        if(sr<0 || sc<0 || sr>=image.length ||sc>=image[0].length || image[sr][sc] != Color ){
            return;
        }
        image[sr][sc] = newColor;

        helper(image, sr, sc-1, Color, newColor);
        helper(image, sr, sc+1, Color, newColor);
        helper(image, sr-1, sc, Color, newColor);
        helper(image, sr+1, sc, Color, newColor);
    }
}

