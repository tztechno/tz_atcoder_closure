abc186_a.clj
############################################
############################################
############################################
############################################
############################################
############################################
############################################
############################################
(def n (read))
(def w (read))
(def ans (quot n w))
(print ans)
############################################
(let [input (read-line)
      [n w] (map read-string (clojure.string/split input #" "))]
    (println (quot n w))
    )
############################################
[python]
n,w=map(int,input().split())
print(n//w)
############################################