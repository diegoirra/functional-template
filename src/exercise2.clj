(ns exercise2)

(defn only-greater-than-five
  "Does some math calculation."
  [x]
  (filter
    (fn
      [y]
      (> y 5)
      )
    x
  )
)
