class Graph {

    private final int MAX_VERTS = 32;   // максимальное количество вершин
    private Vertex[] vertexList;        //массив который хранит вершины
    private int[][] adjMat;             // матрица смежности "А B С D"
    private int size;                   // будет храниться количество вершин
    private Stack stack;
    private Queue queue;

    public Graph() {
        stack = new Stack(MAX_VERTS);
        queue = new Queue(MAX_VERTS);
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        size = 0;
        // созадние матрцы смежности нулями
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = 0;
            }
        }
    }

    private int getAdjUnvisitedVertex(int ver) {  // метод возвращает непосещенную вершину, смежную по отнощеник к ver
        for (int i = 0; i < size; i++) {
            if (adjMat[ver][i] == 1 && vertexList[i].wasVisited == false) {
                return i; // возращает первую найденую вершину
            }
        }
        return -1;      // таких вершин нет
    }

    // боход в глубину
    public void dfs() {                                 // алгоритм начинает с вершины 0
        vertexList[0].wasVisited = true;                // пометка
        displayVertex(0);                               // Вывод
        stack.push(0);                               // занесение в стек
        while (!stack.isEmpty()) {                      // пока стек не опустеет
            int v = getAdjUnvisitedVertex(stack.peek()); // получение непосещенной вешниы, смежной к текущей
            if (v == -1) {                              // Если такой вершины нет
                stack.pop();                            // элемент извелкатеся из стека
            } else {                                    // если вершина найдена
                vertexList[v].wasVisited = true;        // пометка
                displayVertex(v);                       //  вывод
                stack.push(v);                          // занесение в стек
            }
        }
        for (int i = 0; i < size; i++) {        // стек пуст, работа закончена
            vertexList[i].wasVisited = false;   // сброс флагов
        }
    }

    // обход в ширину

    public void bfs() {
        vertexList[0].wasVisited = true;
        displayVertex(0);
        queue.insert(0); // Вставка в конец очереди
        int v2;
        while (!queue.isEmpty()) {
            int v1 = queue.remove();
            while ((v2 = getAdjUnvisitedVertex(v1)) != -1) {
                vertexList[v2].wasVisited = true; // пометка
                displayVertex(v2); // вывод
                queue.insert(v2);
            }
        }
        for (int i = 0; i < size; i++) {    //Сброс флагов
            vertexList[i].wasVisited = false;
        }
    }


    public void addVertex(char label) {          // добавление вершины в граф
        vertexList[size++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {    //добавление ребра межуд вершинами
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int vertex) {      // вывод в консоль наименования вершины
        System.out.println(vertexList[vertex].label);
    }
}
