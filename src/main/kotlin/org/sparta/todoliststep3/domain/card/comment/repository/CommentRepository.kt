package org.sparta.todoliststep3.domain.card.comment.repository

import org.sparta.todoliststep3.domain.card.comment.model.Comment
import org.springframework.data.jpa.repository.JpaRepository

interface CommentRepository: JpaRepository<Comment, Long> {
}