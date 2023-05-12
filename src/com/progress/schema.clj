(ns com.progress.schema)

(def schema
  {:learn/id :uuid
   :learn [:map {:closed true}
           [:xt/id                     :learn/id]
           [:learn/user                :string]
           [:learn/created-at            inst?]
           [:learn/updated-at inst?]
           [:learn/name :string]
           [:learn/source :string]
           [:learn/type :string]
           [:learn/notes :string]
           [:learn/status :string]]})

(def plugin
  {:schema schema})
