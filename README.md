    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Addresses> addresses;
   /* mappedBy = "user": refers to the user field in the Address entity

      cascade = CascadeType.ALL: saving/deleting user also does the same for their addresses

      orphanRemoval = true: removes address if it’s no longer linked to a user
    */
