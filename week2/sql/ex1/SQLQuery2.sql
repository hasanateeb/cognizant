WITH RowNumberRanked AS (
    SELECT 
        ProductID,
        ProductName,
        Category,
        Price,
        ROW_NUMBER() OVER (PARTITION BY Category ORDER BY Price DESC) AS RowNum
    FROM Products
)
SELECT 
    ProductID,
    ProductName,
    Category,
    Price,
    RowNum
FROM RowNumberRanked
WHERE RowNum <= 3
ORDER BY Category, RowNum;
