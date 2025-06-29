WITH DenseRanked AS (
    SELECT 
        ProductID,
        ProductName,
        Category,
        Price,
        DENSE_RANK() OVER (PARTITION BY Category ORDER BY Price DESC) AS DenseRankNum
    FROM Products
)
SELECT 
    ProductID,
    ProductName,
    Category,
    Price,
    DenseRankNum
FROM DenseRanked
WHERE DenseRankNum <= 3
ORDER BY Category, DenseRankNum;