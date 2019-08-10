import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private boolean isVisited;
    private List<Vertex> neighborList;

    public Vertex(String name) {
        this.setName(name);
        this.setNeighborList(new ArrayList<>());
    }

    public void addNeighbor(Vertex vertex){
        this.neighborList.add(vertex);
    }

    public List<Vertex> getNeighborList() {
        return neighborList;
    }

    public void setNeighborList(List<Vertex> neighborList) {
        this.neighborList = neighborList;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }


}