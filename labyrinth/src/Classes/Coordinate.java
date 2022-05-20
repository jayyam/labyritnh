/**
 * Coordinate.java.
 * Clase coordinate para usar como objeto
 * DMS/OAGS - 2021/22
 * version v1.2.0
 */

package Classes;

public class Coordinate
{
	public int i;
	public int j;
	public int direction;

/**
	private boolean findPath(direction) {
		// We have reached the end point, and solved the maze
		if (location.equals(maze.getEndCoords())) {
			System.out.println("Found path length: " + pathLength);
			maze.setMazeArray(mazeArray);
			return true;
		}

	 *   = 0 = Final
	 * ^ = 1 = Arriba = i-1
	 * v = 2 = Abajo = i+1
	 * < = 3 = Izquierda = j-1
	 * > = 4 = Derecha = j+1
	 *   = 5 = Sin Salida = eliminar del array lo contado hasta volver a donde te permita seguir
	 *	if(Coordinate nextCell = getNextCell(path.get(path.size()-1)));
	 *   Comprueba si nextCell es valida o no
     *
 *
 * Breadth-first search
 *
 *      queue.add(startNode)
 *
 * while not queue.isEmpty:
 *           node = queue.remove()
 *
 *     if node is solution:
 *         return
 *     else:
 *         queue.addAll(node.children)
 *
 * A couple of additional notes:
 *     The above algorithms are suitable for trees: mazes that don't have loops.
 *     If your mazes have loops then you'll need to make sure you don't revisit nodes you've already seen.
 *     In that case, you'll need to add logic to keep track of all the already visited nodes
 *     and avoid adding them onto the stack/queue a second time.
 *
 *     As written, these algorithms will find the target node
 *     but they don't remember the path that got them there.
	 * */

}
