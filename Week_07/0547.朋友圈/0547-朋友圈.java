class Solution {
    private int[] parent;

    // ���鼯
    public int findCircleNum(int[][] M) {
        int N = M.length;
        parent = new int[N];
        // Ĭ�ϳ�ʼ��-1�Լ�Ϊ��
        Arrays.fill(parent, -1);

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (M[i][j] == 1) {
                    union(i, j);
                }
            }
        }
        // �������еĸ�(ֵΪ-1)�ĸ�����Ϊ���ϵĸ���
        int cnt = 0;
        for (int id : parent) {
            if (id == -1)
                cnt++;
        }
        return cnt;
    }

    private void union(int x, int y) {
        int xp = findRoot(x);
        int yp = findRoot(y);
        if (xp != yp)  // ����Ѿ���ͬһ���������򲻱غϲ�
            parent[yp] = xp;
    }

    private int findRoot(int id) {
        if (parent[id] == -1)
            return id;
        parent[id] = findRoot(parent[id]); // ·��ѹ��
        return parent[id];
    }
}