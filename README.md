# springboot-k8-help

To access the application outside the cluster
kubectl port-forward --address 0.0.0.0 svc/helloservice-svc 30123:31234

To access the application outside the cluster
kubectl port-forward --address 0.0.0.0 svc/helpservice-svc 30124:31235