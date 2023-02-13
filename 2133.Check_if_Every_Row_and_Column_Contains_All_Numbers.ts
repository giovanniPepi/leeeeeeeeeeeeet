const checkValid = (matrix: number[][]): boolean => {
  // Checks for our matrix size 
  const n = matrix.length;

  for (let i = 0; i < n; i++) {
    // Sets are used to store unique values inside a list
    // it's usually a faster method than using "array.includes"

    let columnItems = new Set();
    let rowItems = new Set();

    for (let j = 0; j < n; j++) {
      // Row check
      let rowItem = matrix[i][j];

      // We already have this number, break for loop and return false
      if (rowItems.has(rowItem)) return false;

      // We didn't see this number before, add it to our set
      rowItems.add(rowItem)


      // Column check
      let columItem = matrix[j][i];

      // We already have this number, break for loop and return false
      if (columnItems.has(columItem)) return false;

      // We didn't see this number before, add it to our set
      columnItems.add(columItem)
    }
  }
  return true;
}