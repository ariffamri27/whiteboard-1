import java.util.*;

public class P9Test {

    public static class Result {
        public boolean pathExists;
        public List<String> path;

        public Result(boolean pathExists, List<String> path) {
            this.pathExists = pathExists;
            this.path = path;
        }

        @Override
        public String toString() {
            if (pathExists) {
                return "True (" + String.join(" --> ", path) + ")";
            } else {
                return "False";
            }
        }
    }

    public static Result findPath(Map<String, List<String>> graph, String start, String end) {
        if (!graph.containsKey(start) || !graph.containsKey(end)) {
            return new Result(false, new ArrayList<>());
        }

        Queue<Pair> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(new Pair(start, new ArrayList<>(Arrays.asList(start))));

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            String currentNode = current.node;
            List<String> path = current.path;

            if (currentNode.equals(end)) {
                return new Result(true, path);
            }

            if (!visited.contains(currentNode)) {
                visited.add(currentNode);

                for (String neighbor : graph.getOrDefault(currentNode, new ArrayList<>())) {
                    if (!visited.contains(neighbor)) {
                        List<String> newPath = new ArrayList<>(path);
                        newPath.add(neighbor);
                        queue.add(new Pair(neighbor, newPath));
                    }
                }
            }
        }

        return new Result(false, new ArrayList<>());
    }

    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B"));
        graph.put("B", Arrays.asList("A", "C", "D", "E"));
        graph.put("C", Arrays.asList("F"));
        graph.put("D", Arrays.asList("G", "E"));
        graph.put("E", Arrays.asList("F"));
        graph.put("F", Arrays.asList("B", "G"));
        graph.put("G", new ArrayList<>());
        graph.put("H", new ArrayList<>());

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start node: ");
        String start = scanner.nextLine();

        System.out.print("Enter end node: ");
        String end = scanner.nextLine();

        Result result = findPath(graph, start, end);
        System.out.println(result);
    }

    static class Pair {
        String node;
        List<String> path;

        Pair(String node, List<String> path) {
            this.node = node;
            this.path = path;
        }
    }
}
