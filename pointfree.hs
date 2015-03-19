f1 x y = x - y
f2 x y = (-) x y
f3 x   = (-) x
f4     = (-)

g1 x = f4 2 x
g2   = f4 2

main = do
    print $ g2 5
