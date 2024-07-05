测试URL

```
http://localhost:8080/graphiql
```

```
query{
actorList{
  actorId,lastUpdate,firstName,lastName
}
}
# query{
#   findOneActor(id:10){
#     actorId,lastUpdate,firstName,lastName
#   }
# }
```