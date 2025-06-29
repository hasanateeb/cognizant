WITH RankBased AS (
    SELECT 
        ProductID,
        ProductName,
        Category,
        Price,
        RANK() OVER (PARTITION BY Category ORDER BY Price DESC) AS RankNum
    FROM Products
)
SELECT 
    ProductID,
    ProductName,
    Category,
    Price,
    RankNum
FROM RankBased
WHERE RankNum <= 3
ORDER BY Category, RankNum;