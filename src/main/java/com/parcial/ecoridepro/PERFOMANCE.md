1. Búsqueda de vehículos

Se reemplazó la búsqueda lineal por una estructura HashMap.
Esto permite acceder a un vehículo mediante su patente en tiempo constante O(1),
evitando recorrer listas completas.

2. Deduplicación GPS

Se utilizó HashSet para eliminar elementos repetidos.
La colección se recorre una sola vez, evitando bucles anidados y reduciendo
el tiempo de procesamiento.

3. Ordenamiento

Se implementó Comparable en Vehiculo para ordenar por batería
de forma natural.

Además se creó un Comparator externo para ordenar por tarifa
base descendente sin modificar el criterio natural.