MYSQL vs MONGODB

1. 
MongoDB Query:  db.bios.find().count()

<img width="1680" alt="Screen Shot 2022-10-31 at 10 05 33 PM" src="https://user-images.githubusercontent.com/48584294/199162979-38207eff-8350-4c78-a6fd-380cc03fdd52.png">
2.
db.bios.find({
    birth: {
        $lt: ISODate("1950-01-01T00:00:00.000Z")
    }
})
<img width="1680" alt="Screen Shot 2022-10-31 at 10 21 41 PM" src="https://user-images.githubusercontent.com/48584294/199164589-588e57c8-80fe-4dda-83e4-916c542ef32f.png">

3.
db.bios.distinct("awards.award")
<img width="1680" alt="Screen Shot 2022-10-31 at 10 22 15 PM" src="https://user-images.githubusercontent.com/48584294/199164634-9727e3e9-b797-441c-84cf-e92cd8d73045.png">

4.
db.bios.find({}, {"name.first": 1, _id: 0}).sort({"name.first": 1})

<img width="1679" alt="Screen Shot 2022-10-31 at 10 23 32 PM" src="https://user-images.githubusercontent.com/48584294/199164770-cd7104bc-a8b0-43b2-98d8-2171e3991f07.png">

5.
db.bios.find({}, {"name.first": 1, _id: 0}).sort({"name.first": -1})

<img width="1680" alt="Screen Shot 2022-10-31 at 10 24 37 PM" src="https://user-images.githubusercontent.com/48584294/199164879-b8770a91-1fd1-4ded-9d99-e9ae3d014384.png">

6. 
db.bios.find({"awards": {$exists: false}}).count()

<img width="1680" alt="Screen Shot 2022-10-31 at 10 25 29 PM" src="https://user-images.githubusercontent.com/48584294/199164985-cb377dc6-2f2c-460e-9fce-4441c30f7d69.png">

7. 
db.bios.find({"awards": {$exists: false}}, {_id: 1})

<img width="1668" alt="Screen Shot 2022-10-31 at 10 42 10 PM" src="https://user-images.githubusercontent.com/48584294/199166775-9f83453f-fefd-4119-b3da-32fe3fd011b4.png">

8. 
b.bios.aggregate(
    { $unwind: "$awards" },
    { $group: {
        _id: {$concat: ["$name.first", " ", "$name.last"]},
        totalawards: { $sum: 2 }
    }}
)

db.bios.aggregate([
    {$project: { 
        totalcontribs: { $size: "$contribs" }
    }}
])

<img width="1669" alt="Screen Shot 2022-10-31 at 10 43 34 PM" src="https://user-images.githubusercontent.com/48584294/199166910-97e544fa-b23a-4f8f-a6c7-877f3a2615c9.png">

9. 
 b.bios.aggregate(
    { $unwind: "$awards" },
    { $group: {
        _id: {$concat: ["$name.first", " ", "$name.last"]},
        totalawards: { $sum: 1 }
    }}
)

db.bios.aggregate([
    {$project: { 
        totalcontribs: { $size: "$contribs" }
    }}
])

<img width="1680" alt="Screen Shot 2022-10-31 at 10 45 29 PM" src="https://user-images.githubusercontent.com/48584294/199167112-2122c3df-e72c-44e5-acd2-e2b9b1ded0c3.png">

10. 
db.bios.find(
    { },
    {
        name: {$concat: ["$name.first", " ", "$name.last"]},
        awards: {award: 1}, _id: 0
    }
).limit(1)

<img width="1680" alt="Screen Shot 2022-10-31 at 10 46 49 PM" src="https://user-images.githubusercontent.com/48584294/199167291-884ffa32-9493-4887-9edb-f47c75230e03.png">




