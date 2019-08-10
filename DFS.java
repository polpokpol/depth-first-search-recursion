import java.util.Stack;

public class DFS{

    private Stack<Vertex> stack;

    public DFS(){
        this.stack = new Stack<>();
    }

    public void dfs(Vertex root){
        
        root.setVisited(true);
        stack.add(root);
        rDfs();


    }

    private void rDfs(){

        if(!stack.isEmpty()){

            Vertex actuaVertex = stack.pop();
            System.out.print(actuaVertex.getName() + " ");

            for (Vertex var : actuaVertex.getNeighborList()) {
                if(!var.isVisited()){
                    var.setVisited(true);
                    stack.add(var);
                }
            }
            rDfs();
        }
    }
}







// import java.util.List;
// import java.util.Stack;

// public class DFS{

//     private Stack<Vertex> stack;

//     public DFS(){
//         this.stack = new Stack<>();
//     }

//     public void dfs(List<Vertex> vertexList){
        
//         for (Vertex v : vertexList) {
//             if( !v.isVisited()){ // important
//                 // v.setVisited(true);
//                 dfsWithStack(v);
//                 // System.out.println("sdffdsdfs");
//             }
//         }
//     }

//     private void dfsWithStack(Vertex rootVertex) {

//         this.stack.add(rootVertex);
//         rootVertex.setVisited(true);

//         while( !stack.isEmpty()){

//             Vertex actualvVertex = stack.pop();
//             System.out.print(actualvVertex + " ");

//             for (Vertex v : actualvVertex.getNeighborList()) {
//                 if(!v.isVisited()){
                    
//                     v.setVisited(true);
//                     System.out.println(v);
//                     this.stack.push(v);
//                 }
//             }
//         }

//     }
// }